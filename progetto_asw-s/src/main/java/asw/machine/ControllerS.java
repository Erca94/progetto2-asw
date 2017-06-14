package asw.machine;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.URI;
import java.util.logging.Logger; 

import asw.machine.s1.client.*;
import asw.machine.s2.client.*;

@Configuration
@RestController
@PropertySource(value={"classpath:application.yml"})
public class ControllerS {
	
	// servizio S attivo sulla porta 8080

	private final Logger logger = Logger.getLogger("asw.machine");
	
//	@Autowired
//	private LoadBalancerClient loadBalancer;
//	
//	@Autowired 
//	private S1Client s1Client;
//
//	@Autowired 
//	private S2Client s2Client;
	
	@Autowired 
	private MachineService machineService;
	

	/*servizio fornito da S nel caso in cui venga specificata solo la 
	casa automobilistica*/
	@RequestMapping("/{casa_automobilistica}")
	public String getMachineTotalSold(@PathVariable String casa_automobilistica) {
		// richiesta del servizio S1
		//String fond = getMachineCasa(casa_automobilistica);
		//String fond = s1Client.getMachineCasa(casa_automobilistica);
		String fond = machineService.getMachineCasa(casa_automobilistica);
		// richiesta del servizio S2
		//String vend = getModelsCasa(casa_automobilistica);
		//String vend = s2Client.getModelsCasa(casa_automobilistica);
		String vend = machineService.getModelsCasa(casa_automobilistica);
		logger.info("getMachineTotalSold(casa_automobilistica): " + fond + vend);
		String output = "La "+ casa_automobilistica + " è stata fondata il " +fond+ " e sono stati venduti " + vend + " modelli in totale";
		return output; 
	}

	/*servizio fornito da S nel caso in cui vengano specificati casa 
	automobilistica e paese di interesse */
	@RequestMapping("/{casa_automobilistica}/{paese}")
	public String getMachineCountrySold(@PathVariable String casa_automobilistica,@PathVariable String paese) {
		// richiesta del servizio S1
		//String fond = getMachineCasa(casa_automobilistica);
		//String fond = s1Client.getMachineCasa(casa_automobilistica);
		String fond = machineService.getMachineCasa(casa_automobilistica);
		// richiesta del servizio S2
		//String vend = getModelsCasaPaese(casa_automobilistica,paese);
		//String vend = s2Client.getModelsCasaPaese(casa_automobilistica,paese);
		String vend = machineService.getModelsCasaPaese(casa_automobilistica,paese);
		logger.info("getMachineCountrySold(casa_automobilistica,paese): " + fond + vend);
		String output = "La "+ casa_automobilistica + " è stata fondata il " +fond+ " e sono stati venduti " + vend + " modelli in "+paese;
		return output; 
	}

//	private String getModelsCasaPaese(String casa_automobilistica, String paese) {
//		ServiceInstance instance = loadBalancer.choose("s2");
//		if (instance!=null) {
//		URI uri = instance.getUri();
//		if (uri!=null) {
//			String url = uri.toString().concat("/"+casa_automobilistica+"/"+paese);
//		return new RestTemplate().getForObject(url, String.class);
//		}
//		}
//		return null;
//	}
//	
//	private String getModelsCasa(String casa_automobilistica) {
//		ServiceInstance instance = loadBalancer.choose("s2");
//		if (instance!=null) {
//		URI uri = instance.getUri();
//		if (uri!=null) {
//			String url = uri.toString().concat("/"+casa_automobilistica);
//		return new RestTemplate().getForObject(url, String.class);
//		}
//		}
//		return null;
//	}
//	
//	private String getMachineCasa(String casa_automobilistica) {
//		ServiceInstance instance = loadBalancer.choose("s1");
//		if (instance!=null) {
//		URI uri = instance.getUri();
//		if (uri!=null) {
//			String url = uri.toString().concat("/"+casa_automobilistica);
//		return new RestTemplate().getForObject(url, String.class);
//		}
//		}
//		return null;
//	}

}

package asw.machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.machine.s1.client.*;
import asw.machine.s2.client.*;

@Service
public class MachineServiceImplementation implements MachineService {

	@Autowired 
	private S1Client s1Client;

	@Autowired 
	private S2Client s2Client;

	@HystrixCommand(fallbackMethod="getFallbackS1")
	public String getMachineCasa(String casa_automobilistica) {
		return s1Client.getMachineCasa(casa_automobilistica);
	}
	
	public String getFallbackS1(String casa_automobilistica) { 
		return "FallBack S1 !!!"; 
	}

	@HystrixCommand(fallbackMethod="getFallbackS21")
	public String getModelsCasa(String casa_automobilistica) {
		return s2Client.getModelsCasa(casa_automobilistica);
	}
	
	public String getFallbackS21(String casa_automobilistica) { 
		return "FallBack S2 !!!"; 
	}

	@HystrixCommand(fallbackMethod="getFallbackS22")
	public String getModelsCasaPaese(String casa_automobilistica, String paese) {
		return s2Client.getModelsCasaPaese(casa_automobilistica,paese);
	}

	public String getFallbackS22(String casa_automobilistica, String paese) { 
		return "FallBack S2 !!!"; 
	}

}

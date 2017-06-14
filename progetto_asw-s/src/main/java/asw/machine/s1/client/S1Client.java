package asw.machine.s1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("s1")
public interface S1Client {
	
	@RequestMapping(value="/{casa_automobilistica}", method=RequestMethod.GET)
	public String getMachineCasa(@PathVariable (value = "casa_automobilistica") String casa_automobilistica);

}

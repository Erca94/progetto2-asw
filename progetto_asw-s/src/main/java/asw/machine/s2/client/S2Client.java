package asw.machine.s2.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("s2")
public interface S2Client {
	
	@RequestMapping(value="/{casa_automobilistica}/{paese}", method=RequestMethod.GET)
	public String getModelsCasaPaese(@PathVariable (value = "casa_automobilistica") String casa_automobilistica, @PathVariable (value = "paese") String paese);
	
	@RequestMapping(value="/{casa_automobilistica}", method=RequestMethod.GET)
	public String getModelsCasa(@PathVariable (value = "casa_automobilistica") String casa_automobilistica);

}

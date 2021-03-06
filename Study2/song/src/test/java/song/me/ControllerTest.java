package song.me;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
/**
 * Test Source Code
 * @author songm
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
@WebAppConfiguration
public class ControllerTest {
	
	@Autowired WebApplicationContext context;
	MockMvc mvc;
	
	/**
	 * @Autowired로 Mock을 받을 수 있는 것은 Spring Boot 부터 지원 되는 것 같다.
	 */
	@Before
	public void setMock()
	{
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	/**
	 * Hello Test
	 * @throws Exception
	 * @Return RestBody
	 */
	@Test
	public void helloTest() throws Exception
	{
		mvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/indexPage")).andDo(print()).andExpect(status().isOk());	
	}
	
	/**
	 * Controller Test
	 *  MultipleURI Test
	 */
	@Test
	public void multipleURITest() throws Exception
	{
		
		mvc.perform(get("/hi")).andDo(print()).andExpect(status().isOk()).andExpect(handler().methodName("getMultimapping"));
		mvc.perform(get("/testURI")).andDo(print()).andExpect(status().isOk());
		mvc.perform(post("/hi")).andDo(print()).andExpect(status().isOk());
		mvc.perform(post("/testURI")).andDo(print()).andExpect(status().isOk());
			
	}
	/**
	 * AssignMent Test
	 * @throws Exception 
	 */
	@Test
	public void assignment() throws Exception
	{
		//get
		mvc.perform(get("/events")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/events/")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/events/1")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/events/2")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/events/0")).andDo(print()).andExpect(status().isOk());
		mvc.perform(get("/events/4")).andDo(print()).andExpect(status().isOk());
		//post
		mvc.perform(post("/events/").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		mvc.perform(post("/events/1").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		mvc.perform(post("/events/2").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		//put
		mvc.perform(put("/events").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		mvc.perform(put("/events/").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		mvc.perform(put("/events/1").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		mvc.perform(put("/events/2").header("Content-Type","application/json").accept(MediaType.APPLICATION_JSON_VALUE)).andDo(print()).andExpect(status().isOk());
		//delete
		mvc.perform(delete("/events")).andDo(print()).andExpect(status().isOk());
		mvc.perform(delete("/events/")).andDo(print()).andExpect(status().isOk());
		mvc.perform(delete("/events/1")).andDo(print()).andExpect(status().isOk());
		mvc.perform(delete("/events/2")).andDo(print()).andExpect(status().isOk());
		mvc.perform(delete("/events/0")).andDo(print()).andExpect(status().isOk());
		mvc.perform(delete("/events/4")).andDo(print()).andExpect(status().isOk());
	}
	
	
	

}

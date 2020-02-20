package song.me;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes=AppConfig.class)
public class FileTest {
	@Autowired 
	private WebApplicationContext context;
	private MockMvc mvc;
	
	@Before
	public void makeMvc()
	{
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testFile() throws Exception
	{
		MockMultipartFile jsonFile = new MockMultipartFile("test.json", "", "application/json", "{\"key1\": \"value1\"}".getBytes());
		mvc.perform(MockMvcRequestBuilders.fileUpload("/file").file("file",jsonFile.getBytes()).characterEncoding("UTF-8")).andExpect(status().isOk()).andDo(print());
	}
}

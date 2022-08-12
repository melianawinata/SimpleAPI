package co.id.domain.common.callback.controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/public/callback")
public class CallBackController {

	public static final Logger logger = LoggerFactory.getLogger(CallBackController.class);

	@PostMapping
	public ResponseEntity<String> add(@RequestBody Map<String, Object> data) throws JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		json = objectMapper.writeValueAsString(data);
		System.out.println(json);
		
    	for (Map.Entry<String, Object> entry : data.entrySet()) {
    		System.out.println("Key : " + entry.getKey() + " Value : " + (String) entry.getValue());
    	}
		
		return new ResponseEntity<>("OK !", HttpStatus.OK);
	}

}
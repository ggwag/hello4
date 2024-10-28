package org.kosa.hello;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

	@GetMapping("/api/foo")
	public ResponseEntity<Object> foo() {
		return ResponseEntity.ok(
				Map.of(
						"status", "success", 
						"message : " , "안녕하세요"));
	}
}

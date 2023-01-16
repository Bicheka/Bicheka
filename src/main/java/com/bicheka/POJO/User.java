package com.bicheka.POJO;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Document("user")
public class User {

    @Id
	private String id;

	@NotBlank(message =  "username cannot be blank")
	@NonNull
	private String username;

	@NotBlank(message =  "password cannot be blank")
    @NonNull
	private String password;


}
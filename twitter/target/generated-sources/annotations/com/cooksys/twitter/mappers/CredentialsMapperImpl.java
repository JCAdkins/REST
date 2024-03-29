package com.cooksys.twitter.mappers;

import com.cooksys.twitter.dtos.CredentialsDto;
import com.cooksys.twitter.entities.Credentials;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T17:45:02-0700",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CredentialsMapperImpl implements CredentialsMapper {

    @Override
    public CredentialsDto entityToDto(Credentials entity) {
        if ( entity == null ) {
            return null;
        }

        CredentialsDto credentialsDto = new CredentialsDto();

        credentialsDto.setUsername( entity.getUsername() );
        credentialsDto.setPassword( entity.getPassword() );

        return credentialsDto;
    }

    @Override
    public Credentials DtoToEntity(CredentialsDto credentialsRequestDto) {
        if ( credentialsRequestDto == null ) {
            return null;
        }

        Credentials credentials = new Credentials();

        credentials.setUsername( credentialsRequestDto.getUsername() );
        credentials.setPassword( credentialsRequestDto.getPassword() );

        return credentials;
    }
}

package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T20:47:10-0500",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}

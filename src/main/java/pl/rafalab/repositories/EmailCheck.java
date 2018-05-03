package pl.rafalab.repositories;

@FunctionalInterface
public interface EmailCheck {

public boolean emailConirmation(Long id, String email );

}

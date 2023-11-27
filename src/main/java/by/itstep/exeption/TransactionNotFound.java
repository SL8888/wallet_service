package by.itstep.dto.repository;

public class TransactionNotFound extends RuntimeException{
    TransactionNotFound(String message){
        super(message);
    }
}

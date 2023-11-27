package by.itstep.dto.repository;
import lombok.*;
import java.util.UUID;

@Data
public class Transaction {
    private TransactionType transactionType;
    private UUID uuid;
    private Long amount;

}

package robledo.junior.picpaysimplificado.domain.transaction;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal amount, Long payeeId, Long payerId)  {
    
}

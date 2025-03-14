package caaiobomfim.expensemanager.service;

import caaiobomfim.expensemanager.model.Expense;
import caaiobomfim.expensemanager.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        System.out.println("LOGGER: SERVICE REQUEST GET");
        return expenseRepository.findAll();
    }

    public Expense saveExpense(Expense expense) {
        System.out.println("LOGGER: SERVICE REQUEST POST");
        return expenseRepository.save(expense);
    }
}
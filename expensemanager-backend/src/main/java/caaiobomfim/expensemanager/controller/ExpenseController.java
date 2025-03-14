package caaiobomfim.expensemanager.controller;

import caaiobomfim.expensemanager.model.Expense;
import caaiobomfim.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        System.out.println("LOGGER: CONTROLLER REQUEST GET");
        return expenseService.getAllExpenses();
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        System.out.println("LOGGER: CONTROLLER REQUEST POST");
        return expenseService.saveExpense(expense);
    }
}
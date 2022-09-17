package com.example.aplicativoWed.Servicios;

import com.example.aplicativoWed.Entidades.Transaction;
import com.example.aplicativoWed.Repositorio.RepoTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiTransactionImp {

    @Autowired
    RepoTransaction repoTransaction;


    public List<Transaction> verMovDinero(){
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.addAll(repoTransaction.findAll());
        return transactions;

    }
    public void crearMovDinero(Transaction transaction){
        repoTransaction.save(transaction);

    }
    public void editarMovDinero(){

    }
    public void eliminarMovDinero(Integer Id){
        repoTransaction.deleteById(Id);

    }
}

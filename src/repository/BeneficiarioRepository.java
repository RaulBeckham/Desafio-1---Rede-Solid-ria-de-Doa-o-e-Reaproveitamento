package repository;

import java.util.ArrayList;
import model.Beneficiario;

public class BeneficiarioRepository {

    private ArrayList<Beneficiario> beneficiarios = new ArrayList<>();

    public void adicionarBeneficiario(Beneficiario beneficiario) {
        beneficiarios.add(beneficiario);
    }

    public ArrayList<Beneficiario> listarBeneficiarios() {
        return beneficiarios;
    }

    public Beneficiario buscarPorId(int id) {

    for (Beneficiario beneficiario : beneficiarios) {

        if (beneficiario.getId() == id) {
            return beneficiario;
        }
    }

    return null;
}
}

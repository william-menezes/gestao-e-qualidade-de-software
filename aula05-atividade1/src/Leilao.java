import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private String produto;
    private List<Lance> lances = new ArrayList<>();

    public Leilao(String produto) {
        this.produto = produto;
    }

    public void propoe(Lance lance) {
        this.lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}

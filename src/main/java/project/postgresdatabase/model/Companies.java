package project.postgresdatabase.model;

import javax.persistence.*;

@Entity
@Table(name="companies")
public class Companies {

    @Override
    public String toString() {
        return "Companies{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", market_cap=" + market_cap +
                ", ipo_year=" + ipo_year +
                ", sector='" + sector + '\'' +
                ", industry='" + industry + '\'' +
                ", summary_quote='" + summary_quote + '\'' +
                '}';
    }

    @Id
    @Column(name="symbol")
    private String symbol;

    @Column(name="name")
    private String name;

    @Column(name="market_cap")
    private double market_cap;

    @Column(name="ipo_year")
    private int ipo_year;

    @Column(name="sector")
    private String sector;

    @Column(name="industry")
    private String industry;

    @Column(name="summary_quote")
    private String summary_quote;

    public Companies() {}

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public int getIpo_year() {
        return ipo_year;
    }

    public void setIpo_year(int ipo_year) {
        this.ipo_year = ipo_year;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSummary_quote() {
        return summary_quote;
    }

    public void setSummary_quote(String summary_quote) {
        this.summary_quote = summary_quote;
    }

    public Companies(String symbol, String name, double market_cap, int ipo_year, String sector, String industry, String summary_quote) {
        this.symbol = symbol;
        this.name = name;
        this.market_cap = market_cap;
        this.ipo_year = ipo_year;
        this.sector = sector;
        this.industry = industry;
        this.summary_quote = summary_quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return symbol;
    }

    public void setId(String symbol) {
        this.symbol = symbol;
    }
}

package com.example.voiture20.models;

public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Client client;

    // Constructeurs
    public CarResponse() {
    }

    public CarResponse(Long id, String brand, String model, String matricule, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
        this.client = client;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Pattern Builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String brand;
        private String model;
        private String matricule;
        private Client client;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder matricule(String matricule) {
            this.matricule = matricule;
            return this;
        }

        public Builder client(Client client) {
            this.client = client;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(id, brand, model, matricule, client);
        }
    }

    // equals() et hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarResponse that = (CarResponse) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (matricule != null ? !matricule.equals(that.matricule) : that.matricule != null) return false;
        return client != null ? client.equals(that.client) : that.client == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (matricule != null ? matricule.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }

    // toString()
    @Override
    public String toString() {
        return "CarResponse{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", matricule='" + matricule + '\'' +
                ", client=" + client +
                '}';
    }
}
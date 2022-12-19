package br.com.futurodev.LibraryLabSchool.model;

public enum TypeCard {
    CREDIT("Credit"),
    DEBIT("Debit");

    private String info;

    TypeCard(String _info) {
        this.info = _info;
    }

    public String getInfo() {
        return info;
    }
}

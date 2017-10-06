package com.company.model;

public class Dictionary {
    protected String wordPl;
    protected String wordEng;

    public Dictionary(String wordPl, String wordEng) {
        this.wordPl = wordPl;
        this.wordEng = wordEng;
    }

    public String getWordPl() {
        return wordPl;
    }

    public void setWordPl(String wordPl) {
        this.wordPl = wordPl;
    }

    public String getWordEng() {
        return wordEng;
    }

    public void setWordEng(String wordEng) {
        this.wordEng = wordEng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dictionary that = (Dictionary) o;

        if (wordPl != null ? !wordPl.equals(that.wordPl) : that.wordPl != null) return false;
        return wordEng != null ? wordEng.equals(that.wordEng) : that.wordEng == null;
    }

    @Override
    public int hashCode() {
        int result = wordPl != null ? wordPl.hashCode() : 0;
        result = 31 * result + (wordEng != null ? wordEng.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "wordPl='" + wordPl + '\'' +
                ", wordEng='" + wordEng + '\'' +
                '}';
    }
}

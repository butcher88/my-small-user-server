package me.parfenov.mysmalluserserver;

class ErrorInfo {

    public final String url;
    public final String ex;

    public ErrorInfo(String url, Exception ex) {
        this.url = url;
        this.ex = ex.getLocalizedMessage();
    }

    public ErrorInfo(String url, Exception ex, String message) {
        this.url = url;
        this.ex = message;
    }
}
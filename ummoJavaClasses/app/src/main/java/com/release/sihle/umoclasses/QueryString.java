package com.release.sihle.umoclasses;

/**
 * Created by sihle on 2015/07/04.
 */
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by sihle on 2015/06/13.
 */
class QueryString {
    private StringBuilder query = new StringBuilder();
    public QueryString() {
    }
    public synchronized void add(String name, String value) {
        query.append('&');
        encode(name, value);
    }
    private synchronized void encode(String name, String value) {
        try {
            query.append(URLEncoder.encode(name, "UTF-8"));
            query.append('=');
            query.append(URLEncoder.encode(value, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("Broken VM does not support UTF-8");
        }
    }
    public synchronized String getQuery() {
        return query.toString();
    }
    @Override
    public String toString() {
        return getQuery();
    }
}

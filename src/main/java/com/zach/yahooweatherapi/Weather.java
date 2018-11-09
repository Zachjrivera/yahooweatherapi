package com.zach.yahooweatherapi;

import com.zach.yahooweatherapi.pojos.Query;


public class Weather {

    private Query query;


    public   Weather(){}

    public Weather(Query query) {
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "{" +
                "query=" + query +
                '}';
    }
}

package com.aliyun.hitsdb.client.value.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MultiFieldQueryResult {
    private String metric;
    private List<String> aggregatedTags;
    private Map<String, String> tags;
    private List<String> columns = new ArrayList<String>();
    private List<List<Object>> values = new ArrayList<List<Object>>();

    public String getMetric() {
        return metric;
    }

    public List<String> getAggregatedTags() {
        return aggregatedTags;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<List<Object>> getValues() {
        return values;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public void setAggregatedTags(List<String> aggregatedTags) {
        this.aggregatedTags = aggregatedTags;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public void setValues(List<List<Object>> values) {
        this.values = values;
    }

    public Map<String, String> getTags() {
        return tags;
    }
}

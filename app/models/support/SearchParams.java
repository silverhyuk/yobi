package models.support;

import models.enumeration.Matching;

import java.util.ArrayList;
import java.util.List;

public class SearchParams {

    private List<SearchParam> searchParams;

    public SearchParams() {
        this.searchParams = new ArrayList<SearchParam>();
    }

    public SearchParams add(String field, Object value, Matching matching) {
        this.searchParams.add(new SearchParam(field, value, matching));
        return this;
    }

    public List<SearchParam> getSearchParams() {
        return searchParams;
    }

    public List<SearchParam> clean() {
        this.searchParams.clear();
        return this.searchParams;
    }
}

package com.engagepoint.teama.cmismanager;

import com.engagepoint.teama.cmismanager.model.TypeDTO;

import java.util.List;

public class ResultSet {

    private List<FileStatusReport> statusReportList;
    private List<TypeDTO> sortedTypeList;

    public ResultSet(List<FileStatusReport> statusReportList) {
        super();
        this.statusReportList = statusReportList;
    }

    public ResultSet(List<FileStatusReport> statusReportList, List<TypeDTO> sortedTypeList) {
        this(statusReportList);
        this.sortedTypeList = sortedTypeList;
    }

    public List<FileStatusReport> getStatusReportList() {
        return statusReportList;
    }

    public List<TypeDTO> getSortedTypeList() {
        return sortedTypeList;
    }
}

package com.dls.structural.adapter;

public class XmlToJsonAdapter extends JsonPlug {
    private XmlPlug xmlPlug;

    public XmlToJsonAdapter(XmlPlug xmlPlug) {
        this.xmlPlug = xmlPlug;
    }

    public void plugInJson() {
        System.out.println();
        System.out.println("methods to make compatible to json :::");
        super.plugInJson();
        xmlPlug.plugInXml();
        System.out.println(":::");
    }
}

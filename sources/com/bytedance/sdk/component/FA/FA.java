package com.bytedance.sdk.component.FA;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FA implements Comparable<FA>, Runnable {
    private String NOt;
    private int ZRu;

    public FA(String str, int i10) {
        this.ZRu = 0;
        this.ZRu = i10 == 0 ? 5 : i10;
        this.NOt = str;
    }

    public String getName() {
        return this.NOt;
    }

    public int getPriority() {
        return this.ZRu;
    }

    public void setPriority(int i10) {
        this.ZRu = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(FA fa2) {
        if (getPriority() < fa2.getPriority()) {
            return 1;
        }
        return getPriority() >= fa2.getPriority() ? -1 : 0;
    }

    public FA(String str) {
        this.ZRu = 5;
        this.NOt = str;
    }
}

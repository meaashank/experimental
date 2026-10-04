package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FilterWord {
    private String NOt;
    private String ZRu;
    private boolean mZ;
    private List<FilterWord> uR;

    public FilterWord(String str, String str2) {
        this.ZRu = str;
        this.NOt = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.uR == null) {
            this.uR = new ArrayList();
        }
        this.uR.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.ZRu;
    }

    public boolean getIsSelected() {
        return this.mZ;
    }

    public String getName() {
        return this.NOt;
    }

    public List<FilterWord> getOptions() {
        return this.uR;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.uR;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.ZRu) || TextUtils.isEmpty(this.NOt)) ? false : true;
    }

    public void setId(String str) {
        this.ZRu = str;
    }

    public void setIsSelected(boolean z10) {
        this.mZ = z10;
    }

    public void setName(String str) {
        this.NOt = str;
    }

    public FilterWord() {
    }
}

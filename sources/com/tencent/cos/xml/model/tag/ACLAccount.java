package com.tencent.cos.xml.model.tag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ACLAccount {
    List<String> idList = new ArrayList();

    public void addAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.idList.add(String.format("id=\"qcs::cam::uin/%s:uin/%s\"", str, str2));
    }

    public String getAccount() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.idList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        String string = sb2.toString();
        int iLastIndexOf = string.lastIndexOf(",");
        if (iLastIndexOf > 0) {
            return string.substring(0, iLastIndexOf);
        }
        return null;
    }

    public void addAccount(String str) {
        addAccount(str, str);
    }
}

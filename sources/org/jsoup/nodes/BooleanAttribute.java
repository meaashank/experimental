package org.jsoup.nodes;

/* JADX INFO: loaded from: classes6.dex */
public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, null);
    }

    @Override // org.jsoup.nodes.Attribute
    public boolean isBooleanAttribute() {
        return true;
    }
}

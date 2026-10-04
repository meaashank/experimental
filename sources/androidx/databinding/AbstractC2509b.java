package androidx.databinding;

import androidx.databinding.t;

/* JADX INFO: renamed from: androidx.databinding.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2509b extends C2508a {

    /* JADX INFO: renamed from: androidx.databinding.b$a */
    public class a extends t.a {
        public a() {
        }

        @Override // androidx.databinding.t.a
        public void f(t tVar, int i10) {
            AbstractC2509b.this.notifyChange();
        }
    }

    public AbstractC2509b() {
    }

    public AbstractC2509b(t... tVarArr) {
        if (tVarArr == null || tVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (t tVar : tVarArr) {
            tVar.addOnPropertyChangedCallback(aVar);
        }
    }
}

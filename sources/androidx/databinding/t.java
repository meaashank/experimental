package androidx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public interface t {

    public static abstract class a {
        public abstract void f(t sender, int propertyId);
    }

    void addOnPropertyChangedCallback(a callback);

    void removeOnPropertyChangedCallback(a callback);
}

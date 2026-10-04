package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
public interface w {
    long a();

    int b(int cmd, String type, Object viewObject, float[] in2, int inLength, float[] out, int outLength);

    Boolean c(Object keyFrame, Object view, float x10, float y10, String[] attribute, float[] value);

    boolean d(Object view, int position, int type, float x10, float y10);

    void e(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes);

    void f(float position);

    void g(Object view, int position, String name, Object value);

    float h(Object view, int type, float x10, float y10);

    Object i(Object viewObject, float x10, float y10);
}

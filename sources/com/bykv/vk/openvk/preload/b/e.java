package com.bykv.vk.openvk.preload.b;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.b.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    <T> T a(Class<T> cls);
}

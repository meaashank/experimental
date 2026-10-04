package com.unity3d.services.core.properties;

import com.unity3d.services.identifiers.SessionId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface Session {

    @NotNull
    public static final Default Default = Default.$$INSTANCE;

    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private static final String f194504id = SessionId.INSTANCE.getId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        @NotNull
        public String getId() {
            return f194504id;
        }
    }

    @NotNull
    String getId();
}

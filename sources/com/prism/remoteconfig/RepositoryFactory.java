package com.prism.remoteconfig;

import com.prism.remoteconfig.firebase.FirebaseRemoteConfigs;
import pb.InterfaceC5402b;

/* JADX INFO: loaded from: classes7.dex */
public class RepositoryFactory {
    private static FirebaseRemoteConfigs remoteConfig;

    public static InterfaceC5402b getRemoteConfig() {
        if (remoteConfig == null) {
            synchronized (RepositoryFactory.class) {
                try {
                    if (remoteConfig == null) {
                        remoteConfig = new FirebaseRemoteConfigs();
                    }
                } finally {
                }
            }
        }
        return remoteConfig;
    }
}

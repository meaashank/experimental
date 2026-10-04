package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public interface IRuntime extends IExecutionDataAccessorGenerator {
    void shutdown();

    void startup(RuntimeData runtimeData) throws Exception;
}

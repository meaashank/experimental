package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    public static final class DefaultImpls {
        @NotNull
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(@NotNull BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        @Nullable
        public static <P extends BaseParams, R> Object invoke(@NotNull BaseTask<? super P, R> baseTask, @NotNull P p10, @NotNull e<? super R> eVar) {
            return baseTask.doWork(p10, eVar);
        }
    }

    @Nullable
    Object doWork(@NotNull P p10, @NotNull e<? super R> eVar);

    @Nullable
    Object invoke(@NotNull P p10, @NotNull e<? super R> eVar);
}

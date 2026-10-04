package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DataMigrationInitializer.Companion f112314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, kotlin.coroutines.e<? super DataMigrationInitializer$Companion$runMigrations$1> eVar) {
        super(eVar);
        this.f112314d = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112313c = obj;
        this.f112315e |= Integer.MIN_VALUE;
        return this.f112314d.c(null, null, this);
    }
}

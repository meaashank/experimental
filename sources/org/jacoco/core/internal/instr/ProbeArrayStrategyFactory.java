package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassReader;

/* JADX INFO: loaded from: classes6.dex */
public final class ProbeArrayStrategyFactory {
    private ProbeArrayStrategyFactory() {
    }

    public static IProbeArrayStrategy createFor(long j10, ClassReader classReader, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        String className = classReader.getClassName();
        int majorVersion = InstrSupport.getMajorVersion(classReader);
        if (!isInterfaceOrModule(classReader)) {
            return majorVersion >= 55 ? new CondyProbeArrayStrategy(className, false, j10, iExecutionDataAccessorGenerator) : new ClassFieldProbeArrayStrategy(className, j10, InstrSupport.needsFrames(majorVersion), iExecutionDataAccessorGenerator);
        }
        ProbeCounter probeCounter = getProbeCounter(classReader);
        return probeCounter.getCount() == 0 ? new NoneProbeArrayStrategy() : (majorVersion < 55 || !probeCounter.hasMethods()) ? (majorVersion < 52 || !probeCounter.hasMethods()) ? new LocalProbeArrayStrategy(className, j10, probeCounter.getCount(), iExecutionDataAccessorGenerator) : new InterfaceFieldProbeArrayStrategy(className, j10, probeCounter.getCount(), iExecutionDataAccessorGenerator) : new CondyProbeArrayStrategy(className, true, j10, iExecutionDataAccessorGenerator);
    }

    private static ProbeCounter getProbeCounter(ClassReader classReader) {
        ProbeCounter probeCounter = new ProbeCounter();
        classReader.accept(new ClassProbesAdapter(probeCounter, false), 0);
        return probeCounter;
    }

    private static boolean isInterfaceOrModule(ClassReader classReader) {
        return (classReader.getAccess() & 33280) != 0;
    }
}

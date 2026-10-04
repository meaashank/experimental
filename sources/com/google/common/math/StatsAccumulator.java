package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;
import s0.C5559a;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public final class StatsAccumulator {
    private long count = 0;
    private double mean = 0.0d;
    private double sumOfSquaresOfDeltas = 0.0d;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public static double calculateNewMeanNonFinite(double d10, double d11) {
        if (Doubles.isFinite(d10)) {
            return d11;
        }
        if (Doubles.isFinite(d11) || d10 == d11) {
            return d10;
        }
        return Double.NaN;
    }

    private void merge(long j10, double d10, double d11, double d12, double d13) {
        long j11 = this.count;
        if (j11 == 0) {
            this.count = j10;
            this.mean = d10;
            this.sumOfSquaresOfDeltas = d11;
            this.min = d12;
            this.max = d13;
            return;
        }
        this.count = j11 + j10;
        if (Doubles.isFinite(this.mean) && Doubles.isFinite(d10)) {
            double d14 = this.mean;
            double d15 = d10 - d14;
            double d16 = j10;
            double d17 = ((d15 * d16) / this.count) + d14;
            this.mean = d17;
            this.sumOfSquaresOfDeltas = ((d10 - d17) * d15 * d16) + d11 + this.sumOfSquaresOfDeltas;
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d10);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d12);
        this.max = Math.max(this.max, d13);
    }

    public void add(double d10) {
        double d11;
        long j10 = this.count;
        if (j10 == 0) {
            this.count = 1L;
            this.mean = d10;
            this.min = d10;
            this.max = d10;
            if (Doubles.isFinite(d10)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j10 + 1;
        if (Doubles.isFinite(d10) && Doubles.isFinite(this.mean)) {
            double d12 = this.mean;
            double d13 = d10 - d12;
            double d14 = (d13 / this.count) + d12;
            this.mean = d14;
            d11 = d10;
            this.sumOfSquaresOfDeltas = C5559a.a(d10, d14, d13, this.sumOfSquaresOfDeltas);
        } else {
            d11 = d10;
            this.mean = calculateNewMeanNonFinite(this.mean, d11);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d11);
        this.max = Math.max(this.max, d11);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public long count() {
        return this.count;
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d10 : dArr) {
            add(d10);
        }
    }

    public void addAll(int... iArr) {
        for (int i10 : iArr) {
            add(i10);
        }
    }

    public void addAll(long... jArr) {
        for (long j10 : jArr) {
            add(j10);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }
}

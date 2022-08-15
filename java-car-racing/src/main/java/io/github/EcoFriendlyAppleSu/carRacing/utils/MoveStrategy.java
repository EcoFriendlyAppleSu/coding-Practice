package io.github.EcoFriendlyAppleSu.carRacing.utils;

import java.util.function.Predicate;

@FunctionalInterface
public interface MoveStrategy {
    boolean canMove();
}
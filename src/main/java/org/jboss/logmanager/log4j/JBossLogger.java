/*
 * JBoss, Home of Professional Open Source.
 *
 * Copyright 2016 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.logmanager.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.AbstractLogger;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
class JBossLogger extends AbstractLogger {
    private final org.jboss.logmanager.Logger logger;
    private final LevelTranslator levelTranslator = LevelTranslator.getInstance();

    JBossLogger(final org.jboss.logmanager.Logger logger) {
        super(logger.getName());
        this.logger = logger;
    }

    JBossLogger(final org.jboss.logmanager.Logger logger, final MessageFactory messageFactory) {
        super(logger.getName(), messageFactory);
        this.logger = logger;
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final Message message, final Throwable t) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final CharSequence message, final Throwable t) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final Object message, final Throwable t) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Throwable t) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object... params) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
        return logger.isLoggable(levelTranslator.translateLevel(level));
    }

    @Override
    public void logMessage(final String fqcn, final Level level, final Marker marker, final Message message, final Throwable t) {
        logger.log(fqcn, levelTranslator.translateLevel(level), message.getFormattedMessage(), t);
    }

    @Override
    public Level getLevel() {
        return levelTranslator.translateLevel(logger.getLevel());
    }
}

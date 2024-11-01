package com.app.broadcastreceiver

/**
 * Цель:
 * - Получение событий из нашего приложения
 * - Получение и передача событий между компонентами приложения (Внутри нашего приложения)
 *
 * BR может принимать следующие события:
 * Системные
 * Из уведомлений
 * Из виджетов
 *
 * Например в уведомлении о новом сообщение мы помечаем его как прочитанное - срабатывает BroadcastReceiver и выполняет соответствующую задачу
 *
 * На BR были наложены ограничения
 * -Нужно помимо манифеста дополнительно указывать что то в активити, иначе событие не придет
 * Андройд намекает на использование других механизмов
 *
 * */
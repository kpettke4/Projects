<?php

use yii\helpers\Html;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Zamówienia';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="zamowienia-index">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Dodaj zamówienie', ['create'], ['class' => 'btn btn-success']) ?>
    </p>


    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'nr_zamowienia',
            'id_klienta',
            'kwota',
            'numer',
            'ilosc',
            //'sposob_odbioru',
            //'czy_zaplacono',

            ['class' => 'yii\grid\ActionColumn'],
        ],
    ]); ?>


</div>

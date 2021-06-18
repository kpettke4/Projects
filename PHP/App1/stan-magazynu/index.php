<?php

use yii\helpers\Html;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Stan Magazynu';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="stan-magazynu-index">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Dodaj do magazynu', ['create'], ['class' => 'btn btn-success']) ?>
    </p>


    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'nazwa',
            'numer',
            'dostepnosc',
            'data_sprzedazy',
            'data_dostawy',

            ['class' => 'yii\grid\ActionColumn'],
        ],
    ]); ?>


</div>

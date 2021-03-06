<?php

use yii\helpers\Html;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Klienci';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="klienci-index">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Dodaj klienta', ['create'], ['class' => 'btn btn-success']) ?>
    </p>


    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'id_klienta',
            'imie',
            'nazwisko',
            'telefon',
            'adres',

            ['class' => 'yii\grid\ActionColumn'],
        ],
    ]); ?>


</div>

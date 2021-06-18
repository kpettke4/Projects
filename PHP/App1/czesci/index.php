<?php

use yii\helpers\Html;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Czesci';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="czesci-index">

    <h1><?= Html::encode($this->title) ?></h1>

    <p>
        <?= Html::a('Dodaj Część', ['create'], ['class' => 'btn btn-success']) ?>
    </p>


    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'numer',
            'nazwa',
            'model',
            'opis',
            'typ_silnika',
            //'stan',
            //'cena',

            ['class' => 'yii\grid\ActionColumn'],
        ],
    ]); ?>


</div>

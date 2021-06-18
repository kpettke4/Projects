<?php

use yii\helpers\Html;
use yii\grid\GridView;
use yii\widgets\Pjax;
/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Przegląd części';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="czesci-view-index">

    <h1><?= Html::encode($this->title) ?></h1>


    <?php Pjax::begin(); ?>

    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'numer',
            'nazwa',
            'model',
            'opis',
            'typ_silnika',
            'stan',
            'cena',

            
        ],
    ]); ?>

    <?php Pjax::end(); ?>

</div>

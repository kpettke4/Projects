<?php

use yii\helpers\Html;
use yii\grid\GridView;
use yii\widgets\Pjax;
/* @var $this yii\web\View */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Stan Magazynowy';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="stan-magazynu-view-index">

    <h1><?= Html::encode($this->title) ?></h1>

   

    <?php Pjax::begin(); ?>

    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'nazwa',
            'numer',
            'dostepnosc',
            'data_sprzedazy',
            'data_dostawy',

            
        ],
    ]); ?>

    <?php Pjax::end(); ?>

</div>

import React, { useState } from 'react';
import { Box, Grid, Typography, Button } from '@material-ui/core';
import './Home.css';


function Home() {

    let[botao, setBotao] = useState ('Login')

    return (
        <>
            <Grid container direction="row" justifyContent="center" alignItems="center" className='caixa'>
                
                <Button onclick={() => setBotao(botao = "Logout")}>
                    {botao}
                </Button>
                
                <Grid alignItems="center" item xs={6}>
                    <Box paddingX={20}>
                        <Typography variant="h3" gutterBottom color="textPrimary" component="h3" align="center" className='titulo'>Seja bem vinde !</Typography>

                        <Typography variant="h5" gutterBottom color="textPrimary" component="h5" align="center" className='titulo'>espresse aqui os seus pensamentos e opiniões!</Typography>
                    </Box>

                    <Box display="flex" justifyContent="center">
                        <Box marginRight={1}>
                        
                        </Box>
                        <Button variant="outlined" className='botao'>Ver Postagens</Button>
                    </Box>
                </Grid>

                <Grid item xs={6}>
                    <img src="https://i.imgur.com/H88yIo2.png" alt="" width="500px" height="500px" />
                </Grid>
                <Grid xs={12} className='postagens'>
                </Grid>
            </Grid>
        </>
    );
}

export default Home;